package ChainOfResponsibility;

public class OrcCommander implements RequestHandler {
  @Override
  public boolean canHandleRequest(Request request) {
    return request.getRequestType() == RequestType.DEFEND_CASTLE;
  }

  @Override
  public int getPriority() {
    return 2;
  }

  @Override
  public void handle(Request request) {
    request.markHandled();
    System.out.println(name() + " handling request " + request);
  }

  @Override
  public String name() {
    return "Orc commander";
  }
}
