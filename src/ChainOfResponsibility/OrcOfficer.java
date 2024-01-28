package ChainOfResponsibility;

public class OrcOfficer implements RequestHandler {
  @Override
  public boolean canHandleRequest(Request request) {
    return request.getRequestType() == RequestType.TORTURE_PRISONER;
  }

  @Override
  public int getPriority() {
    return 3;
  }

  @Override
  public void handle(Request request) {
    request.markHandled();
    System.out.println(name() + " handling request " + request);
  }

  @Override
  public String name() {
    return "Orc officer";
  }
}

