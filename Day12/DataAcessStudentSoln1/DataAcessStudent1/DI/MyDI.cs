using DataAcessStudent1.Models.Abstract;
using DataAcessStudent1.Models.Datatype;
using Ninject;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace DataAcessStudent1.DI
{
    
    public class MyDI:IDependencyResolver
    {
        IKernel kernel ;
        
        public MyDI() 
        {
            kernel = new StandardKernel();
            AllBinding();

        }
        public object GetService(Type serviceType)
        {
            return kernel.TryGet(serviceType);
        }
        public IEnumerable<object> GetServices(Type serviceType)
        {
            return kernel.GetAll(serviceType);
        }

        private  void AllBinding()
        {
            //kernel.Bind<IData>().To<FakeData>();
            kernel.Bind<IData>().To<RealData>();
        }
    }
}