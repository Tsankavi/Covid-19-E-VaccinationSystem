import Modal from "../../../components/modals/MainModal";
import DialogContent from "@mui/material/DialogContent";
import AddAppointmentForm from "../forms1/AddAppointmentForm";

const AddAppointmentModal = () => {
  return (
    <Modal title="Add new Hospital" type="add">
      <DialogContent>
        <AddAppointmentForm />
      </DialogContent>
    </Modal>
  );
};

export default AddAppointmentModal;
