package com.aaron.demospringboot.entity;

import com.aaron.demospringboot.entity.keys.IdTask;
import jakarta.persistence.*;

@Entity(name = "Tasks")
public class Tasks {

    @EmbeddedId
    private IdTask idTask;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", insertable = false, updatable = false)
    private Projects project;

    public IdTask getIdTask() {
        return idTask;
    }

    public void setIdTask(IdTask idTask) {
        this.idTask = idTask;
    }

}
