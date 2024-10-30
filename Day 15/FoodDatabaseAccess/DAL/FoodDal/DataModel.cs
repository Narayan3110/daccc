using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Diagnostics.Tracing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FoodDal
{
    public class DataModel
    {
        public int Oid { get; set; }

        public string Fname { get; set; }

        public int Qty { get; set; }     

    
    }
    public class FoodDAl
    {
        private readonly string CnnStr;
        SqlConnection cnn;
        SqlCommand cmd;

        public FoodDAl(string CnnStr)
        {
            this.CnnStr = CnnStr;
            cnn = new SqlConnection(CnnStr);
            cmd = new SqlCommand();
            cmd.Connection = cnn;
        }


        public IEnumerable<DataModel> GetFood()
        {
            List<DataModel> list = new List<DataModel>();
            cmd.CommandText = "select * from Forder";
            cnn.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                list.Add(new DataModel { Oid = reader.GetInt32(0), Fname = reader.GetString(1), Qty = reader.GetInt32(2) });
            }
            
            reader.Close();
            cnn.Close();
            return list;
        }

        
    }
}
