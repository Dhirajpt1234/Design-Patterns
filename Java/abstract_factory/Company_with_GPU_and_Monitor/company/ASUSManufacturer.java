package Java.abstract_factory.Company_with_GPU_and_Monitor.company;

import Java.abstract_factory.Company_with_GPU_and_Monitor.GPU.Asusgpu;
import Java.abstract_factory.Company_with_GPU_and_Monitor.GPU.GPU;
import Java.abstract_factory.Company_with_GPU_and_Monitor.monitor.AsusMonitor;
import Java.abstract_factory.Company_with_GPU_and_Monitor.monitor.Monitor;

public class ASUSManufacturer extends Company {

    @Override
    Monitor orderMonitor() {
        return new AsusMonitor();
    }

    @Override
    GPU ordeGPU() {
        return new Asusgpu();
    }
    
}
