
package it.bway.salami.model;

import java.util.List;

public class SalamiStepBuilder
    {
        private SalamiStep step;
        public SalamiStepBuilder()
        {
            this.step = new SalamiStep();
        }
        public SalamiStepBuilder withCrontab(String crontab)
        {
            step.crontab = crontab;
            return this;
        }
        public SalamiStepBuilder withSleep(int sleep)
        {
            step.sleep = sleep;
            return this;
        }
        public SalamiStepBuilder withConditions(List<Object> conditions)
        {
            step.conditions = conditions;
            return this;
        }
        public SalamiStepBuilder withActions(List<SalamiAction> actions)
        {
            step.actions = actions;
            return this;
        }
        public SalamiStepAdapter adaptTo()
        {
            return new SalamiStepAdapter(this.step);
        }
    }
