using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using EntityWeb;

namespace EntityWeb.Controllers
{
    public class FordersController : Controller
    {
        private OrdEntities db = new OrdEntities();

        // GET: Forders
        public ActionResult Index()
        {
            return View(db.Forders.ToList());
        }

        // GET: Forders/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Forder forder = db.Forders.Find(id);
            if (forder == null)
            {
                return HttpNotFound();
            }
            return View(forder);
        }

        // GET: Forders/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Forders/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "Oid,Fname,Qty")] Forder forder)
        {
            if (ModelState.IsValid)
            {
                db.Forders.Add(forder);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(forder);
        }

        // GET: Forders/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Forder forder = db.Forders.Find(id);
            if (forder == null)
            {
                return HttpNotFound();
            }
            return View(forder);
        }

        // POST: Forders/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "Oid,Fname,Qty")] Forder forder)
        {
            if (ModelState.IsValid)
            {
                db.Entry(forder).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(forder);
        }

        // GET: Forders/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Forder forder = db.Forders.Find(id);
            if (forder == null)
            {
                return HttpNotFound();
            }
            return View(forder);
        }

        // POST: Forders/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            Forder forder = db.Forders.Find(id);
            db.Forders.Remove(forder);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
