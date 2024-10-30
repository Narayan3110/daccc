
using FoodOrderSystem.Models.Abstract;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;


namespace FoodOrderSystem.Models.Data
{
    public class RealData 
    {
        
        
        public IEnumerable<FoodModel> GetAll()
        {
            FoodDAl food = new FoodDAl();
            food.GetFood();
            return 
        }


    }
}