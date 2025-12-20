package Java.abstract_factory.Company_with_GPU_and_Monitor.company;

import Java.abstract_factory.Company_with_GPU_and_Monitor.GPU.GPU;
import Java.abstract_factory.Company_with_GPU_and_Monitor.monitor.Monitor;

public abstract class Company {

    abstract Monitor orderMonitor();

    abstract GPU ordeGPU();

}
