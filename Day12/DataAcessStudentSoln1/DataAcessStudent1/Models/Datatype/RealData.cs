using DataAcessStudent1.Models.Abstract;
using DbLib;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace  DataAcessStudent1.Models.Abstract
{
    public class RealData : IData
    {
        private readonly string cnnStr = @"data source=ACTS59\SQLEXPRESS01;Initial Catalog=Narayan;Integrated Security=True";

        public bool Addstudent(StudData stu)
        {
            CDal dal = new CDal(cnnStr);
            dal.Add(stu);
            return true;
        }

        public bool DeleteStudent(int Id)
        {
            CDal dal = new CDal(cnnStr);
            
            return dal.Delete(Id);
        }
        public bool UpdateStudent(StudData data)
        {
            CDal dal= new CDal(cnnStr);
                return dal.Update(data);
        }

        public IEnumerable<Stu> getallstudent()
        {
            CDal dal = new CDal(cnnStr);

            var StudentList = dal.GetStudDatas();
            return (from emp in dal.GetStudDatas()
                    select new Stu
                    {
                        Id = emp.Id,
                        Name = emp.Name,
                        Class = emp.Class
                    }).ToList();

            
        }

        
    }
}



