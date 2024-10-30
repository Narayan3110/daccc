using DbLib;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataAcessStudent1.Models.Abstract
{
    public interface IData
    {
        IEnumerable<Stu> getallstudent();
         bool Addstudent(StudData student);

        bool DeleteStudent(int Id);

        bool UpdateStudent(StudData student);
    }
}
