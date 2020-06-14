package jos;

import java.io.*;
import java.util.*;

public abstract class Kontakt implements Serializable {

    private Date timestamp;

    public Date getTimestamp() {
    
	return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        
	this.timestamp = timestamp;
    }

    public abstract String getInformation();
}
