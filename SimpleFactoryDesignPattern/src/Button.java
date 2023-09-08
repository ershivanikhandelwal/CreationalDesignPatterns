import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Button {
    public Double border;
    public abstract void onClick();
    public abstract void render();

}
