#Auto generated Octane revision tag
@TID42003REV0.3.0
Feature: Text Messaging
Background:
  Given: Keyboards have already been selected under Settings


Scenario Outline: User wants to send a text message in  <language>
Given <keyboard> Keyboard has been selected in Settings
Given Messaging app is launched
When I select the globe icon in a text message
Then The <keyboard> keyboard should be available and I can text in <language>.

  Examples:
| keyboard | language |
| Chinese (Simplified) | Mandarin |
| Hebrew | Hebrew |
| Polish | Polish |
| English | English |