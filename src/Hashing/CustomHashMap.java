package Hashing;

import javax.swing.text.html.parser.Entity;

public class CustomHashMap {
    private Entity[] entities;

    public CustomHashMap(){
        entities = new Entity[100];
    }

    private class Entity {
        String keyl;
        String value;

        public Entity(String key , String value){
            this.key = key;
            this.value = value;
        }
    }
}
