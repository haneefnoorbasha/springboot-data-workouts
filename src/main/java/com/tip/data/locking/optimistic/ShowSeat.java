package com.tip.data.locking.optimistic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "opt_lock_show_seat")
@Getter
@Setter
public class ShowSeat {
    @Id
    private Long id;

    private String movie;
    private boolean booked;

    @Version
    private Long version;

    // getters/setters
}
