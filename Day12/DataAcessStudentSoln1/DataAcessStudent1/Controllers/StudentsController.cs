
using DataAcessStudent1.Models.Abstract;
using DataAcessStudent1.Models.Datatype;
using DbLib;
using Ninject;


//using DataAcessStudent1.Models.Datatype;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Xml.Linq;

namespace DAStudent.Controllers
{
    public class StudentsController : Controller
    {
        // GET: Student
        IData data;
        //IData real;
        //IKernel kernel;
        public StudentsController(IData data)
        {
            this.data = data;
            //real = new RealData();
            //kernel = new StandardKernel();
        }

        public ActionResult Index()
        {
            return View(data.getallstudent());
        }

        [HttpGet]
        public ActionResult Addstu()
        {     
            return View(new FakeData());
        }
        [HttpPost]
        public ActionResult Addstu(StudData student)
        {
            data.Addstudent(student);
            return Redirect("Index");
        }
        [HttpGet]
        public ActionResult Del(int Id)
        {
            data.DeleteStudent(Id);
            return RedirectToAction("Index");
        }
        [HttpGet]
        
        public ActionResult Modify(int Id) 
        {
           return View(new FakeData());
        }
        [HttpPost]
        public ActionResult Modify(StudData student)
        {
           data.UpdateStudent(student);
            
            return RedirectToAction("Index");
        }

    }
}