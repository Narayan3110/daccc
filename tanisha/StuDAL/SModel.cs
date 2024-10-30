using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace StuDAL
{
    public class SModel
    {

        public int Id { get; set; }
        public string Name { get; set; }
        public string Class { get; set; }

        public class SDal
        {

            private readonly string cnnstr;
            SqlConnection cnn;
            SqlCommand cmd;

            public SDal(String cnnstr)
            {
                this.cnnstr = cnnstr;
                cnn = new SqlConnection(cnnstr);
                cmd = new SqlCommand();
                cmd.Connection = cnn;
            }

             public IEnumerable<SModel> Getstudent()
            { 
                List<SModel> slist = new List<SModel>();
                cmd.CommandText = "select * from Student";
                cnn.Open();
                SqlDataReader rdr = cmd.ExecuteReader();
                while (rdr.Read())
                {
                    slist.Add(new SModel { Id = rdr.GetInt32(0), Name = rdr.GetString(1), Class = rdr.GetString(2) });
                }
                cnn.Close();
                rdr.Close();
                return slist;
            }

        }

       

    }
}
