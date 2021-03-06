package models

import org.squeryl.{Schema, KeyedEntity}
import java.sql.{Date, Timestamp}

/**
 * @author zutherb
 */
case class BlogEntry(val title: String, val content: String) extends KeyedEntity[Long] with java.io.Serializable {
  val id: Long = 0

  //TODO-NEXT-RELEASE: remove createdAt
  val createdAt: Date = new Date(System.currentTimeMillis)

  //TODO-NEXT-RELEASE: remove createdAt here too
  override def toString = "{id : ${id}, title : ${title}, content : ${content}, createdAt : ${createdAt}}"
}

object AppDB extends Schema  {

  val entries = table[BlogEntry]("entry")

}