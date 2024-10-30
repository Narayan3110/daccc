using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace DbLib
{
    public class StudData
    {

        public int Id { get; set; }
        public string Name { get; set; } = string.Empty;
        public string Class { get; set; } = string.Empty;
    }
        public class CDal
    {
        private readonly string cnnStr;
        SqlConnection cnn;
        SqlCommand cmd;

        public CDal(string cnnstr)
        {
            this.cnnStr = cnnStr;
            cnn = new SqlConnection(cnnstr);
            cmd = new SqlCommand();
            cmd.Connection = cnn;
        }
        public IEnumerable<StudData> GetStudDatas()
        {
            List<StudData> list = new List<StudData>();
            cmd.CommandText = "select* from Student";
            cnn.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                list.Add(new StudData { Id = reader.GetInt32(0), Name = reader.GetString(1), Class = reader.GetString(2) });

            }
            reader.Close();
            cnn.Close();
            return list;
        }

        public bool Add(StudData data) 
        {
            cmd.CommandText = $"insert into Student(Id , Name , Class) values ({data.Id} , '{data.Name}','{data.Class}')";
            cnn.Open();
            int readAdd = cmd.ExecuteNonQuery();
            cnn.Close() ;
            return readAdd > 0;


        }

        public bool Delete(int Id)
        {
            cmd.CommandText = $"delete from Student where Id = {Id}";
            cnn.Open();
            int deleteAdd = cmd.ExecuteNonQuery();
            cnn.Close();
            return deleteAdd > 0;
        }

        public bool Update(StudData studData)
        {
            cmd.CommandText = $"update Student set Name = '{studData.Name}' ,Class = '{studData.Class}' where Id ={studData.Id}";
            cnn.Open() ;
            int updateAdd = cmd.ExecuteNonQuery();
            cnn.Close() ;
            return updateAdd > 0;
        }
        

        


    }



}
   
