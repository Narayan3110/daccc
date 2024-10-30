using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WebCrud.Models
{
    internal interface IAnimal
    {
        IEnumerable<Animals> getallanimals();
        Animals getani(int id);
        bool AddAni(Animals animals);
        bool Deleteani();
        bool Modifyani();
    }
}
