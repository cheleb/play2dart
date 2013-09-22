package controllers

import play.api._
import play.api.mvc._
import play.api.libs.iteratee.Iteratee
import play.api.libs.iteratee.Enumerator
import scala.concurrent.ExecutionContext.Implicits._



object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def ws = WebSocket.using[String] { request => 
    
    // Log events to the console
    val in = Iteratee.foreach[String] {(s)=>{
    	println("woo " + s)
        //   "coucou"
    //	out.+("zozo")
    }
        
    }.map { _ =>
      println("Disconnected")
    }
    
    // Send a single 'Hello!' message
    val out = Enumerator({
      "connected"
    })
    
    (in, out)
  }  
  
}
