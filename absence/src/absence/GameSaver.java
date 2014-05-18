/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absence;

/**
 *
 * @author Danang
 */

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class GameSaver {
	private String name;
	private int score;
	

	public void setAge(int score) {this.score = score;}
	public int getAge() {return score;}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	

        // from here starts the xml encoding/decoding
	public String toString(){
	   StringOutputStream fos = new StringOutputStream();
           XMLEncoder xenc = new XMLEncoder(fos);
	   xenc.writeObject(this);
	   xenc.close();
           return fos.getString();
	}
	public static GameSaver getGameSaver(String xmlObjStr){
	   XMLDecoder decoder = new XMLDecoder(new ByteArrayInputStream(xmlObjStr.getBytes()));
	   GameSaver p = (GameSaver)decoder.readObject();
	   decoder.close();
	   return p;
	}
	private class StringOutputStream extends OutputStream {
	  StringBuilder mBuf = new StringBuilder();
	  public void write(int bytes) throws IOException {mBuf.append((char) bytes);}
	  public String getString() {return mBuf.toString();}
	}
}
