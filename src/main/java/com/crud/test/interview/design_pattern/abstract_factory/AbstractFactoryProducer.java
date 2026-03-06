package com.crud.test.interview.design_pattern.abstract_factory;

public class AbstractFactoryProducer {
    AbstractFactoryProfession abstractFactoryProfession = null;
    public AbstractFactoryProfession isTraineeProfessionType(Boolean isTrainee){
      if(isTrainee)
        abstractFactoryProfession = new TraineeProfessionFactory();
      else
          abstractFactoryProfession = new TrainedProfessionFactory();
      return abstractFactoryProfession;
    }
}
