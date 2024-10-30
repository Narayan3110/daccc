using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using WebCrud.Models;

namespace WebCrud.Controllers
{
    public class DefaultController : Controller
    {
        // GET: Default
        IAnimal animal;
        public DefaultController()
        {
            animal = new Adata();
        }
        public ActionResult Index()
        {

            return View(animal.getallanimals());

        }

        [HttpGet]
        public ActionResult AddAnimal()
        {
           return View(new Adata());
        }
        [HttpPost]
        public ActionResult AddAnimal(Animals animals)
        {
            animal.AddAni(animals);
            return Redirect("Index");
        }
    }
}