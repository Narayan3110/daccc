using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebCrud.Models
{
   
    public class Adata : IAnimal
    {
        static List<Animals> ani = new List<Animals>();
       
    
        static Adata() 
        {
            ani.Add(new Animals { id = 101 , Name ="Horse" , Legs=4, Food="Chane"});
            ani.Add(new Animals { id = 102, Name ="Dog" , Legs=2, Food="Any"});
            ani.Add(new Animals { id = 103, Name ="Hen" , Legs=2, Food="Food itself"});
            ani.Add(new Animals { id = 104, Name ="Cat" , Legs=4, Food="Fish"});
            ani.Add(new Animals { id = 105, Name ="cow" , Legs=4, Food="Grass"});

        }
        public IEnumerable<Animals> getallanimals()
        {
            //List<Animals>getani = new List<Animals>();
            //foreach(Animals ani in ani) 
            //{
            //    //getani.Add(ani.id , ani.Name , ani.Legs , ani.Food);
            //    getani.Add(ani);
            //    return ToString(getani);
            //}
            return ani;
        }

        public bool AddAni(Animals data)
        {
           ani.Add(data);
            return true;
        }

        public bool Deleteani()
        {
            throw new NotImplementedException();
        }

        public Animals getani(int id)
        {
            throw new NotImplementedException();
        }

        public bool Modifyani()
        {
            throw new NotImplementedException();
        }

        public bool AddAni()
        {
            throw new NotImplementedException();
        }

        public bool AddAni(Adata adata)
        {
            throw new NotImplementedException();
        }
    }
}