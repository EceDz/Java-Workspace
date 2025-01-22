package Lab;
import java.util.Comparator;

public class ProcessorSpeedComparator implements Comparator<Computer> {	
	
	@Override
	public int compare(Computer first, Computer second) {
		return Double.compare(first.getProcessorSpeed(),second.getProcessorSpeed());
	}
    
}
