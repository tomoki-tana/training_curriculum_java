package in.tech_camp.training_curriculum_java.form;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PlanForm {
    
    @NotBlank(message = "Email can't be blank")
    private String plan;

    @NotNull(message = "Date can't be blank")
    private LocalDate date;

    // Getter
    public String getPlan() {
        return plan;
    }

    // Setter
    public void setPlan(String plan) {
        this.plan = plan;
    }

    // Getter
    public LocalDate getDate() {
        return date;
    }

    // Setter
    public void setDate(LocalDate date) {
        this.date = date;
    }
}

