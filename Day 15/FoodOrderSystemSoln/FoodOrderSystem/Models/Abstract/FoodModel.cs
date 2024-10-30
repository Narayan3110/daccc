using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace FoodOrderSystem.Models.Abstract
{
    public class FoodModel
    {
        public int Oid { get; set; }
        public string Fname { get; set; }
        public int Qty { get; set; }

    }
    public class FoodDAl
    {
         string CnnStr = @"data source=ACTS59\SQLEXPRESS01;Initial Catalog=Ord;Integrated Security=True";
        SqlConnection cnn;
        SqlCommand cmd;

        public FoodDAl()
        {
            
            cnn = new SqlConnection(CnnStr);
            cmd = new SqlCommand();
            cmd.Connection = cnn;
        }


        public IEnumerable<FoodModel> GetFood()
        {
            List<FoodModel> list = new List<FoodModel>();
            cmd.CommandText = "select * from Forder";
            cnn.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                list.Add(new FoodModel { Oid = reader.GetInt32(0), Fname = reader.GetString(1), Qty = reader.GetInt32(2) });
            }

            reader.Close();
            cnn.Close();
            return list;
        }

        public Boolean AddFood(FoodModel foodmod)
        {
            
            cmd.CommandText = $"insert into Forder values( Oid={foodmod.Oid} , Fname={foodmod.Fname} ,Qty ={foodmod.Qty})";
            cnn.Open(); 
            int addd= cmd.ExecuteNonQuery();
            cnn.Close() ;
            return addd>0;
        }

        internal void AddFood()
        {
            throw new NotImplementedException();
        }
    }
    }