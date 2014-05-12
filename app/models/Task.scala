package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current


/**
 * Created by geek on 5/11/14.
 */
case class Task(id: Long, label: String) {}

object Task {

  val task = {
//    get[Long]("id") ~
//      get[String]("label") map {
//      case id ~ label => Task(id, label)
//    }
  }

  def all() = Nil
  /*
  DB.withConnection { implicit conn =>
    SQL("SELECT * FROM task").as(task *)
  }
  */
  def create(label: String) {
/*
    DB.withConnection { implicit conn =>
      SQL("INSERT INTO task (label) VALUES ({label})").on('label -> label).executeUpdate
    }
    */
  }

  def delete(id: Long) {
    /*
    DB.withConnection { implicit conn =>
      SQL("DELETE FROM task WHERE id={id}").on('id -> id).executeUpdate
    }*/
  }

}
