part of sosimple;

class MySimpleClass {
  
  
  TextAreaElement _console;
  
  MySimpleClass(this._console);
  
  WebSocket _socket;
  
  sayHelo(){
    window.alert("Helo");
  }
  
  
  connect(){
    _socket = new WebSocket("ws://127.0.0.1:9000/ws");
    if(_socket != null  ){
      _socket.onOpen.listen((e){
        _console.appendText("connected to ws\n");
        _socket.send('{"username":"zozo", "message":"helo"}');
        _socket.onMessage.listen((m){
           Map map = parse(m.data);
          _console.appendText("${map["message"]}\n");
        });
      });
      _socket.onClose.listen((e){
        _console.appendText("Close ws\n");
      });
    }else{
      window.alert("Could not connect to websocket" );
      window.alert("${_socket.readyState}");
      
    }
    
  }
  
}


abstract class Persistence {  
  void save(String filename) {  
   print('saving the object as ${toJson()}');  
  }  
    
  void load(String filename) {  
   print('loading from $filename');  
  }  
    
  Object toJson();  
 }  


abstract class Warrior extends Object with Persistence {  
  fight(Warrior other) {  
   // ...  
  }  
 }  
   
 class Ninja extends Warrior {  
  Map toJson() {  
   return {'throwing_stars': true};  
  }  
 }  
   
 class Zombie extends Warrior {  
  Map toJson() {  
   return {'eats_brains': true};  
  }  
 } 


