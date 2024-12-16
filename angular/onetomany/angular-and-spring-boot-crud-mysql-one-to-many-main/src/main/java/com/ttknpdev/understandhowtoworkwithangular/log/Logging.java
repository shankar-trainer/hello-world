package com.ttknpdev.understandhowtoworkwithangular.log;
import com.ttknpdev.understandhowtoworkwithangular.controller.EndPointAddress;
import com.ttknpdev.understandhowtoworkwithangular.controller.EndPointEmployee;
import com.ttknpdev.understandhowtoworkwithangular.services.one.DaoEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public interface Logging {
    Logger endpointEmployee = LoggerFactory.getLogger(EndPointEmployee.class);
    Logger endpointAddress = LoggerFactory.getLogger(EndPointAddress.class);
    Logger daoEmployee = LoggerFactory.getLogger(DaoEmployee.class);
}
