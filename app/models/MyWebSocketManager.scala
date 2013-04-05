package models

import scala.concurrent.Future
import play.api.libs.iteratee.Iteratee
import play.api.libs.iteratee.Enumerator
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.ActorDSL
import akka.actor.Props

object MyWebSocketManager {

  
  lazy val default = {
    val system = ActorSystem("mySystem")
    
    val defActor=system.actorOf(Props[MyWebSocketActor])
      
    defActor
  }
  
//  def connect(): Future[(Iteratee[String,_], Enumerator[String]) ] = {
//  }
  
}


class MyWebSocketActor extends Actor {
  def  receive = {
      case Message(m) => sender ! Message("ok")
    
   }
}


case class Message(message: String);