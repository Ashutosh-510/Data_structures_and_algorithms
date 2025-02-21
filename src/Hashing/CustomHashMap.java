package Hashing;

import javax.swing.text.html.parser.Entity;

public class CustomHashMap {
    private Entity[] entities;

    public CustomHashMap(){
        entities = new Entity[100];
    }

    public void put(String key , String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key,value);

    }
    private class Entity {
        String keyl;
        String value;

        public Entity(String key , String value){
            //this.key = key;
            this.value = value;
        }
    }
}
