package mission;

public class OrderSneakersSituation {
    public static void main(String[] args){
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부

        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 50_000;
        boolean havingNikeSneakersInStore = true; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         *
         *  Customer: 자신의 Cache 와 배송 주문선호 여부
         *  Staff: 자신의 매상, Nike 운동화 정보, 매장의 Nike 운동화 재고 보유여부
         *  DeliverManager: 자신의 매상, Nike 운동화 정보, 포장 정보
         * */
        Customer customer = new Customer();
        Staff staff = new Staff();
        DeliveryManager deliveryManager = new DeliveryManager();
        SneakersInfo nikeSneakerInfo = new SneakersInfo(nikeSneakersFeature, nikeSneakersPrice);

        customer.setCache(100_000);
        customer.setLikeDelivery(isCustomerLikeDelivery);

        customer.askSneakers(staff);





        // TODO: 클래스를 선언하고, 객체간의 협력으로 구현해주세요.
    }
}

class Customer {
    private long cache;
    private boolean likeDelivery;

    public boolean isLikeDelivery() {
        return likeDelivery;
    }

    public void setLikeDelivery(boolean likeDelivery) {
        this.likeDelivery = likeDelivery;
    }

    public long getCache() {
        return cache;
    }

    public void setCache(long cache) {
        this.cache = cache;
    }

    public void askSneakers(Staff staff){
        System.out.println("Nike 운동화에 대해 알려주세요.");
        staff.replySneakers();

    }
}

class Staff{
    private long sales;
    private SneakersInfo sneakersInfo;

    public void replySneakers(){
        System.out.println("Nike 운동화에 대해 알려주세요.");

    }
}

class DeliveryManager{

}

class SneakersInfo{
    private String nikeSneakersFeature;
    private long nikeSneakersPrice;

    public SneakersInfo(String nikeSneakersFeature, long nikeSneakersPrice) {
        this.nikeSneakersFeature = nikeSneakersFeature;
        this.nikeSneakersPrice = nikeSneakersPrice;
    }
}
