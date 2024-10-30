using DataAcessStudent1.Models.Abstract;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace DataAcessStudent1.Models.Datatype
{
    
    
        class FakeData 
        {
            static List<Stu> student = new List<Stu>();
            static FakeData()
            {
                student.Add(new Stu { Id = 1, Name = "A", Class = "dac" });
                student.Add(new Stu { Id = 2, Name = "B", Class = "dbda" });
                student.Add(new Stu { Id = 3, Name = "C", Class = "ss" });
                student.Add(new Stu { Id = 4, Name = "D", Class = "ditis" });
                student.Add(new Stu { Id = 5, Name = "E", Class = "dac" });
            }

        public bool Addstudent(Stu S)
        {
            student.Add(S);
            return true;
        }

        public IEnumerable<Stu> getallstudent()
            {
                return student;
            }
        }
    }
