package hello.hellospring.domain;

public class Member {
    private Long id; //프로그램안에서 자동으로 저장.
    private String name; //유저가 직접 입력

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
