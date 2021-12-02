const sendPost = async (investigationId, plaintext) => {
  const raw_reponse = await fetch(
    `htf.bewire.org/investigation/${investigationId}/`,
    {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ answer: plaintext }),
    }
  );
  const content = await raw_reponse.json();
  console.log(content);
};

const plaintext = "sdspqocvwgkfmq";
//const 
