using Library11;
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
            Console.WriteLine("Consumer 111");
            CA ca = new CA();
            ca.show();
        }
    }
}
