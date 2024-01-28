package ChainOfResponsibility;

public class OrcSoldier implements RequestHandler {
  @Override
  public boolean canHandleRequest(Request request) {
    return request.getRequestType() == RequestType.COLLECT_TAX;
  }

  @Override
  public int getPriority() {
    return 1;
  }

  @Override
  public void handle(Request request) {
    request.markHandled();
    System.out.println(name() + " handling request " + request);
  }

  @Override
  public String name() {
    return "Orc soldier";
  }
}
