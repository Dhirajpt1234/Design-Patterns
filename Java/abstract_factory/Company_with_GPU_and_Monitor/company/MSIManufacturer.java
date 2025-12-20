package Java.abstract_factory.Company_with_GPU_and_Monitor.company;

import Java.abstract_factory.Company_with_GPU_and_Monitor.GPU.GPU;
import Java.abstract_factory.Company_with_GPU_and_Monitor.GPU.MSIgpu;
import Java.abstract_factory.Company_with_GPU_and_Monitor.monitor.MSIMonitor;
import Java.abstract_factory.Company_with_GPU_and_Monitor.monitor.Monitor;

public class MSIManufacturer extends Company {

    @Override
    Monitor orderMonitor() {
       return new MSIMonitor();
    }

    @Override
    GPU ordeGPU() {
        return new MSIgpu();
    }
    
}
