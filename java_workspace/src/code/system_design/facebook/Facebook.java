/*
package code.system_design.facebook;

import java.util.Date;
import java.util.List;

public class Facebook {

    public enum ConnectionInvitationStatus {
        PENDING,
        ACCEPTED,
        REJECTED,
        CANCELED
    }

    public enum AccountStatus {
        ACTIVE,
        CLOSED,
        CANCELED,
        BLACKLISTED,
        DISABLED
    }

    public class Address {
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;
        private String country;

    }

    public class Profile
    {
        private byte[] profilePicture;
        private byte[] coverPhoto;
        private String gender;

        private List<Work> workExperiences;
        private List<Education> eductaions;
        private List<Place> places;
        private List<Stat> stats;

        public boolean addWorkExperience(Work work);
        public boolean addEducation(Education education);
        public boolean addPlace(Place place);
    }

    public class Work {
        private String title;
        private String company;
        private String location;
        private Date from;
        private Date to;
        private String description;
    }



    public class Account {
        private String name;
        private Address address;
        private String email;
        private String phone;

        private Account account;
    }

    public abstract class Person {
        private String name;
        private Address address;
        private String email;
        private String phone;
    }

    public class Member extends Person {
        private Integer memberId;
        private Date dateOfMembership;
        private String name;

        private Profile profile;
        private String city;
    }
    public class Admin extends Person {
        public boolean blockUser(Customer customer);
        public boolean unblockUser(Customer customer);
        public boolean enablePage(Page page);
        public boolean disablePage(Page page);
    }
    public class ConnectionInvitation {
        private Member memberInvited;
        private ConnectionInvitationStatus status;
        private Date dateCreated;
        private Date dateUpdated;
        public bool acceptConnection();
        public bool rejectConnection();
    }

    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;
}
public class Member extends Person {
    private Integer memberId;
    private Date dateOfMembership;
    private String name;
    private
    private
    private
    private
    private
    private
    private
    Profile profile;
    HashSet<Integer> memberFollows;
    HashSet<Integer> memberConnections;
    HashSet<Integer> pageFollows;
    HashSet<Integer> memberSuggestions;
    HashSet<ConnectionInvitation> connectionInvitations;
    HashSet<Integer> groupFollows;
    public boolean sendMessage(Message message);
    public boolean createPost(Post post);
    public boolean sendConnectionInvitation(ConnectionInvitation invitation);
    private Map<Integer, Integer> searchMemberSuggestions();
}
public class Admin extends Person {
    public boolean blockUser(Customer customer);
    public boolean unblockUser(Customer customer);
    public boolean enablePage(Page page);
    public boolean disablePage(Page page);
}
public class ConnectionInvitation {
    private Member memberInvited;
    private ConnectionInvitationStatus status;
    private Date dateCreated;
    private Date dateUpdated;
    public bool acceptConnection();
    public bool rejectConnection();
}Profile and Work: A member’s profile will have their work
        (/learn)
        experiences, educations, places, etc:
        Java
        Python
public class Profile {
    private byte[] profilePicture;
    private byte[] coverPhoto;
    private String gender;
    private
    private
    private
    private
    List<Work> workExperiences;
    List<Education> educations;
    List<Place> places;
    List<Stat> stats;
    public boolean addWorkExperience(Work work);
    public boolean addEducation(Education education);
    public boolean addPlace(Place place);
}
public class Work {
    private String title;
    private String company;
    private String location;
    private Date from;
    private Date to;
    private String description;
}
public  class Page{
    private Integer pageId;
    private String name;
    private String description;
    private String type;
    private int totalMembers;
    private List<Recommendation> recommendation;

    private List<Recommendation> getRecommendation();
}

public class Recommendation {
    private Integer recommendationId;
    private int rating;
    private String description;
    private Date createdAt;

}
*/
