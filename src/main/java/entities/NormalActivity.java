package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends Activity {

    private List<Step> steps;

    public NormalActivity(String name, String state, Iteration iteration) {
        super(name, state, iteration);
        this.steps = new ArrayList<>();
    }

    public void addStep(Step step) {
        this.steps.add(step);
    }

    @Override
    public Duration getDuration() throws SabanaResearchException {
        if(this.steps.isEmpty()){
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_NORMAL_ACTIVITY);
        }
        Duration d = Duration.ofDays(0);
        for (Step step : this.steps){
            d = d.plus(step.getDuration());
        }
        return d;
    }
}
