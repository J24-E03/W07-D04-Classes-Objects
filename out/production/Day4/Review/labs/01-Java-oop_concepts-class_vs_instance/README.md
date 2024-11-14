# 02.10 - 01. Java OOP Concepts - TV Party

It's time to make a TV party! You invited your friends over on a Saturday night to watch some movies on Netflix. The popcorn is ready, so let's set the TV to work!

The TV **class** is already created for you and will have regular TV operations such as Turn On, Turn Off, Volume Up, Volume Down, Channel Up, Channel Down, Set Channel and Set Volume.

These operations are defined in the TV **class**, and therefore, are common operations to any TV. But knowing what a TV does doesn't mean you have a TV, and that's why you need to have an **instance object** of the TV class.

### Overview of TV.java:
- Initialize the channel variable and set it to 1;
- Initialize the volumeLevel variable and set it to 1;
- Set the turnedOn variable to false so that the TV is in the default off position;
- turnOn() method should turn the TV on;
- turnOff() method should turn the TV off;
- channelUp() should increment the channel by 1. Note that the TV must be on;
- channelDown() should decrement the channel by 1. Note that the TV must be on;
- setChannel() method to set the TV to a specific channel. Note that the TV must be on;
- volumeUp() should increment the volume by 1. Note that the TV must be on;
- volumeDown() should decrement the volume by 1. Note that the TV must be on;
- The channel's range should be between 1 and 100. The methods channelUp(), channelDown() and setChannel() should take this range into account;
- The volume's range should be between 1 and 10. The methods volumeUp() and volumeDown() should take this range into account.

### Overview of TVParty.java:
- Create an instance object of the TV class;
- Part 1:
  - Turn the TV on;
  - Set the channel to 3; 
  - Set the volume to 7;
- Set the TV off for food break;
- Part 2:
    - Turn the TV on;
    - Set the channel to 95;
    - Set the volume to 5;