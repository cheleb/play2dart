library sosimple;

import 'dart:html';
import 'dart:json';

part '_mylib.dart';

void main() {
  
  MySimpleClass my = new MySimpleClass(query("#ws_console"));
  my.connect();

  
  query("#sample_text_id")
    ..text = "Click me!"
    ..onClick.listen(reverseText);
  
  
  
}

void reverseText(MouseEvent event) {
  var text = query("#sample_text_id").text;
  var buffer = new StringBuffer();
  for (int i = text.length - 1; i >= 0; i--) {
    buffer.write(text[i]);
  }
  query("#sample_text_id").text = buffer.toString();
  
 }




