package com.company.entities.auditorium;

public class AuditoriumBuilder {
    private boolean computers;
    private boolean projector;
    private int auditoriumsCapacity;

    public AuditoriumBuilder setComputers(boolean computers) {
        this.computers = computers;
        return this;
    }

    public AuditoriumBuilder setAuditoriumsCapacity(int auditoriumsCapacity) {
        if (auditoriumsCapacity > 0) {
            this.auditoriumsCapacity = auditoriumsCapacity;
        }
        return this;
    }

    public AuditoriumBuilder setProjector(boolean projector) {
        this.projector = projector;
        return this;
    }

    public AuditoriumBuilder() {
        computers = false;
        projector = false;
        auditoriumsCapacity = 1;
    }

    public Auditorium build(int number) {
        return new Auditorium(computers, projector, auditoriumsCapacity, number);
    }
}
