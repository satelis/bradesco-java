public class CEPInvalidoException extends Exception{
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2356935");
            System.out.println(cepFormatado);

        } catch (CEPInvalidoException e) {
            System.out.println("CEP não corresponde com as normas padrões.");
        }
    }

    static String formatarCep(String cep) throws CEPInvalidoException {
        if (cep.length() != 8) {
            throw new CEPInvalidoException();
        }
        //simulando formatação de cep
        return "23.568-935";
    }
}
