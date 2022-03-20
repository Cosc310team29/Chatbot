# Chatbot

We will focus specifically on the domain of a shipping company for our chatbot, we will start by just focusing on the receiving end of the shipping.<br />
User call the chat bot by calling "Hello".<br />
If the comment is invalid, the bot will shows waht the user type and return.<br />
After the bot is called User can chooes the service by enter the number:<br />
1 issue with the item<br />
2 item not yet received<br />
3 comments to the item<br />
4 for the person-person customer service<br />
The Bot will show different comments for different choices.<br />
If the comment is invalid, the bot will return and request the user to choose again

<div class="mermaid">
            graph TD 
            A[Client] --> B[ChatBot] : Request Service
            B --> A :Respone to Request
        </div>
