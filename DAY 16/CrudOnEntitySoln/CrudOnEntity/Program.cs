using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CrudOnEntity
{
    internal class Program
    {
        static void MainSelect()
        {
            using (NarayanEntities narayanEntities = new NarayanEntities())
            {
                var listStudents = from emp in narayanEntities.Students select emp;

                Console.WriteLine($"{"ID",-15}{"Name",-15}{"Class",-10}");

                foreach (var item in listStudents)
                {
                    Console.WriteLine($"{item.Id,-15}{item.Name,-15}{item.Class}");
                }
            }
             
        }
        static void MainAdd() 
        {
            using(NarayanEntities narayanEntities = new NarayanEntities())
            {
                Student student = new Student { Id = 100 ,Name="Tani" ,Class="DAC" };
                narayanEntities.Students.Add(student);
                narayanEntities.SaveChanges();
                MainSelect();

            }
        }
        static void Main() 
        {
            using(NarayanEntities narayanEntities = new NarayanEntities())
            {
               var StudentL  = (from student in narayanEntities.Students
                where student.Id == 100
                select student).First();
                narayanEntities.Students.Remove(StudentL);
                narayanEntities.SaveChanges();
                
                MainSelect();

            }
        }

    }
}
