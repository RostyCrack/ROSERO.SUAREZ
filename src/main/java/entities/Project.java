package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private Group group;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public Duration getDuration() throws SabanaResearchException {
        if (this.iterations.size()==0) {
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_PROJECT);
        }
        else{
            Duration d = Duration.ofDays(0);
            for (Iteration iteration : this.iterations) {
                d = d.plus(iteration.getDuration());
            }
        return d;
    }


    }

}
