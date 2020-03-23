/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

/**
 *
 * @author lovro
 */
public class Tables {
    public class User {
        public int id;
        public String username;
        public String email;
        public String password;
        
        public User(int _id, String _username, String _email, String _password) {
            id = _id;
            username = _username;
            email = _email;
            password = _password;
        }
    }
    //	id	name	text	color	date
    public class Note {
        public int id;
        public String name;
        public String text;
        public String color;
        public String date;
        
        public Note(int _id, String _name, String _text, String _color, String _date) {
            id = _id;
            name = _name;
            text = _text;
            color = _color;
            date = _date;
        }        
    }
    
    public class Note_User {
        public int id;
        public int note_id;
        public int user_id;
        public Boolean admin;
        public Boolean editable;
        
        public Note_User(int _id, int _note_id, int _user_id, Boolean _admin, Boolean _editable) {
            id = _id;
            note_id = _note_id;
            user_id = _user_id;
            admin = _admin;
            editable = _editable;
        }
    }
}
