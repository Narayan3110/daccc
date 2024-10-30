using Lib1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Consumer1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("consumer 1");
            c1 h = new c1();
            h.show();
        }
    }
}
