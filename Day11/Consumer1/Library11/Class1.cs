using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Library11
{
    public class CA
    {

        public CA()
        {
            Console.WriteLine("CA Ctor 3.0.0.0");
        }

        public void show()
        {
            Console.WriteLine("CA Show 3.0.0.0");
        }

        ~CA()
        {
            {
                Console.WriteLine("Ca Finalizer ");
            }
        }
    }
}
