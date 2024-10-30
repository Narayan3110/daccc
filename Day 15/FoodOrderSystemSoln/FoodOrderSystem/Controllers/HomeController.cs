using FoodOrderSystem.Models.Abstract;

using System;
using System.Collections.Generic;
using System.EnterpriseServices;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace FoodOrderSystem.Controllers
{
    public class HomeController : Controller
    {
        FoodDAl dAl;
        // GET: Home

        public ActionResult Index(FoodDAl food)
        {
            return View(food.GetFood());
        }

        [HttpGet]
        public ActionResult AddFood()
        {            
            return View(new FoodModel());
        }
        [HttpPost]
        
        public ActionResult AddFood(FoodModel model)
        {           
            dAl.AddFood();
            return Redirect("Index");
        }
    }
}